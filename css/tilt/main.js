const card = document.querySelector('.card');

card.addEventListener('mousemove',cardMouseMove)

function cardMouseMove(event){
    let cardH = card.offsetHeight
    let cardW = card.offsetWidth

    let centerX = card.offsetLeft+cardW/2
    let centerY = card.offsetTop+cardH/2

    let mouseX = event.clientX-centerX
    let mouseY = event.clientY-centerY
    
    
    console.log("x",mouseX,mouseY)

    let rotateX = (-1)*15*mouseY/(cardH/2)
    let rotateY = 15*mouseX/(cardW/2)

    card.style.transform=`perspective(1000px) rotateX(${rotateX}deg) rotateY(${rotateY}deg)`



}