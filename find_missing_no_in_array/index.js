function findMissingInArr(num) {
    var max = Math.max.apply(Math, num);
    var min = Math.min.apply(Math, num);
    var missingNo;
    var arrSize = num.length;
  
    for(let i=min; i<= max; i++) {
      if(!num.includes(i)) { 
        missingNo = i;
      }
    }
    return missingNo;
  }
  
  var numberSeq= [21,25,29,28,22,24,27,26,30];
  console.log(findMissingInArr(numberSeq));