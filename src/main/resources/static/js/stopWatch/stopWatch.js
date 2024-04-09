
var timer;
var isRunning = false;
var seconds = 0, minutes = 0, hours = 0;

function startStopwatch() {
    isRunning = !isRunning;
    var button = document.getElementById("startStopButton");
    if (isRunning) {
        timer = setInterval(updateTime, 1000);
        button.textContent = "Stop";
        button.classList.remove("btn-success");
        button.classList.add("btn-danger");
    } else {
        clearInterval(timer);
        button.textContent = "Start";
        button.classList.remove("btn-danger");
        button.classList.add("btn-success");
    }
}




function resetStopwatch() {
    clearInterval(timer);
    seconds = 0;
    minutes = 0;
    hours = 0;
    document.querySelector(".display").textContent = "00:00:00";
    isRunning = false;
    var button = document.getElementById("startStopButton");
    button.textContent = "Start";
    button.classList.remove("btn-danger");
    button.classList.add("btn-success");
}


function updateTime() {
    seconds++;
    if (seconds >= 60) {
        seconds = 0;
        minutes++;
        if (minutes >= 60) {
            minutes = 0;
            hours++;
        }
    }
    document.querySelector(".display").textContent =
        (hours < 10 ? "0" + hours : hours) + ":" +
        (minutes < 10 ? "0" + minutes : minutes) + ":" +
        (seconds < 10 ? "0" + seconds : seconds);
}

document.getElementById("startStopButton").addEventListener("click", startStopwatch);
document.getElementById("resetButton").addEventListener("click", resetStopwatch);


