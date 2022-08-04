let displayElem = document.querySelector(".display");
let minusFiveElem = document.querySelector(".minusfive");
let minusOneElem = document.querySelector(".minusone");
let zeroElem = document.querySelector(".zero");
let plusOneElem = document.querySelector(".plusone");
let plusFiveElem = document.querySelector(".plusfive");

let count = 0;

function pushDisplay(){
    displayElem.innerHTML = count;
};

minusFiveElem.addEventListener("click", () => {
    count = count - 5,
    pushDisplay();
})

minusOneElem.addEventListener("click", () => {
    count = count - 1,
    pushDisplay();
})

zeroElem.addEventListener("click", () => {
    count = 0,
    pushDisplay();
})

plusOneElem.addEventListener("click", () => {
    count = count + 1,
    pushDisplay();
})

plusFiveElem.addEventListener("click", () => {
    count = count + 5,
    pushDisplay();
})

//Couldn't figure out history, sorry boss. Said I was good because I thought
//I got it working. I did not. Pride goeth before the fall