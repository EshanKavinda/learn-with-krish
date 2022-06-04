function findMissingInArr(num) {
    var max = Math.max.apply(Math, num);
    var min = Math.min.apply(Math, num);
    var missingNo = null;
    var arrSize = num.length;
  
    for(let i=min; i<= max; i++) {
      if(!num.includes(i)) { 
        missingNo = i;
      }
    }

    if(missingNo==null){
      missingNo = min-1;
    }
    return missingNo;
  }
  
  var numberSeq= [21,25,29,28,22,24,27,26,30,23];
  console.log(findMissingInArr(numberSeq));