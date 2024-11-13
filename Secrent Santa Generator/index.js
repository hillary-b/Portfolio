
/*const partName = document.getElementById("participant");*/
var participants = [];
var storedArray;

document.getElementById("submitName").onclick = function(){
    var nHTML = '';
    var participantName = document.getElementById("participant");

        participants.push(participantName.value);
        participants.forEach(function(x){
            nHTML += '<li>' + x + '</li>';
        });

    document.getElementById("participantList").innerHTML ='<ul>' + nHTML + '</ul>'
}

document.getElementById("clearList").onclick = function(){
    var nHTML = '';

    participants = [];
    participants.forEach(function(x){
        nHTML += '<li>' + x + '</li>';
    });

    document.getElementById("participantList").innerHTML ='<ul>' + nHTML + '</ul>'
}

document.getElementById("submitParticipants").onclick = function(){  
    /*window.location.href = "runGenerator.html";
    exports.participants;*/
    sessionStorage.setItem('TheArray', JSON.stringify(participants));
    window.location.href = "runGenerator.html";
}
