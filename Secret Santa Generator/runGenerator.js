
var sessionString = sessionStorage.getItem('TheArray');
var secondArray = JSON.parse(sessionString);
console.log(secondArray);
var secretSanta = document.getElementById("ssName")
var giftee = secondArray[Math.floor(Math.random() * secondArray.length)];
let index = secondArray.indexOf(giftee);

document.getElementById("getGiftee").onclick = function(){
targetEmail = document.getElementById("ssEmail")
    /*console.log(index)
    console.log(giftee)
    var nHTML = '';

    nHTML += giftee;
    document.getElementById("gifteeName").innerHTML = nHTML
    window.open('mailto:' + document.getElementById("ssEmail") + '?subject=Your secret santa giftee!&body=You are secret santa for ' + giftee + '!').onsubmit();*/

    if(secretSanta === giftee){
        let tempArray = secondArray
        tempArray.splice(index)
        giftee = tempArray[Math.floor(Math.random() * tempArray.length)];
        var nHTML = '';
        nHTML += giftee;
        document.getElementById("gifteeName").innerHTML = nHTML
        window.open('mailto:' + targetEmail + '?subject=Your secret santa giftee!&body=You are secret santa for ' + giftee + '!');
    }else{
        var nHTML = '';
        nHTML += giftee;
        document.getElementById("gifteeName").innerHTML = nHTML
        window.open('mailto:' + document.getElementById("ssEmail") + '?subject=Your secret santa giftee!&body=You are secret santa for ' + giftee + '!');
        secondArray.splice(giftee);
        console.log(secondArray);
    }


}
