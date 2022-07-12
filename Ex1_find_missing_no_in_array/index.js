function findMissingInArr(start, num) {
    var max = Math.max.apply(Math, num);
    var min = start;
    var missingNo = null;
    var arrSize = num.length;

    if(num.includes(min)){
      for(let i=min; i<= max; i++) {
        if(!num.includes(i)) { 
          missingNo = i;
        }
      }
      if(missingNo==null){
        missingNo = max+1;
      }
    }else{
      missingNo = min;
    }
    
    return missingNo;
  }
  
  var start = 21;
  var numberSeq0= [21,25,29,28,22,24,27,26,30]; // missing value is 23
  var numberSeq1= [25,29,28,22,24,27,26,30,23]; // missing value is 21 (minimum)
  var numberSeq2= [21,25,29,28,22,24,27,26,23]; // missing value is 30 (maximum)

  console.log(findMissingInArr(start, numberSeq0));
  console.log(findMissingInArr(start, numberSeq1));
  console.log(findMissingInArr(start, numberSeq2));