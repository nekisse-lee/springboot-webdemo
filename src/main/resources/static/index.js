const title = document.querySelector("#title");

const CLICKED_ClASS = "clicked";

function handleClick() {
    title.classList.toggle(CLICKED_ClASS);
    // const hasClass = title.classList.contains(CLICKED_ClASS);
    // if (hasClass) {
    //     title.classList.remove(CLICKED_ClASS);
    // } else {
    //     title.classList.add(CLICKED_ClASS);
    // }
}

function init() {
    title.addEventListener("click", handleClick);
}

init();
