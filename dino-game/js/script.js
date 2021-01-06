console.log("Início - Jogo do Dinossauro!");

const dino = document.querySelector(".dino");

//keycode.info verificar qual numeracao da tecla
function handleKeyUp(event) {
  if (event.keyCode === 32) {
    jump();
  }
}

function jump() {
  let position = 0;

  let upInterval = setInterval(() => {
    if (position >= 150) {
      clearInterval(upInterval);
      //descendo
      let downInterval = setInterval(() => {
        if (position <= 0) {
          clearInterval(downInterval);
        } else {
          position -= 20;
          dino.style.bottom = position + "px";
        }
      }, 20);
    } else {
      //subindo
      position += 20;
      dino.style.bottom = position + "px";
    }
  }, 20); //executado a cada 20 mili secunds
}

document.addEventListener("keyup", handleKeyUp);
