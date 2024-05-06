function log(s){
    console.log(s)
}
const observer = new IntersectionObserver(
    entries=>{
        entries.forEach(entry=>{
            //if entry.isIntersecting is true then toggle "show", means if show is present remove it and vice versa
            entry.target.classList.toggle("show",entry.isIntersecting) 

            //as soon as they become visible on the page remove observer, for just first time animation
            if(entry.isIntersecting){
                observer.unobserve(entry.target)
            }
        })
    },
    {
        threshold:.5, //it has value form 0 to 1
        // rootMargin:"-100px" //to show and observe specifc area of container 
        rootMargin:"100px" // to start creating elements by observing the container by increaing the height by 100vh+100px
    }
)

let cards = document.querySelectorAll('.card')
cards.forEach(card=>{
    observer.observe(card)
})

//for infinite scrolling and adding new cards each time we reach the last element
const lastObserver = new IntersectionObserver(entries=>{

    if(entries[0].isIntersecting==false) return 
    loadMoreContent()
    lastObserver.unobserve(entries[0].target)
    lastObserver.observe(document.querySelector(".card:last-child"))
    
})

//now we are observing last card
lastObserver.observe(document.querySelector('.card:last-child'))

const cardContainer = document.querySelector(".card-container")
function loadMoreContent(){
    for(let i=0;i<10;i++){
        const card = document.createElement("div")
        card.textContent="New Card"
        card.classList.add("card")
        observer.observe(card)
        cardContainer.append(card)
    }
}