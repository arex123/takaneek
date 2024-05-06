function log(s){
    console.log(s)
}
const observer = new IntersectionObserver(
    entries=>{
        entries.forEach(entry=>{
            entry.target.classList.toggle("show",entry.isIntersecting)
        })
    },
    {
        threshold:.5
    }
)
let cards = document.querySelectorAll('.card')
cards.forEach(card=>{
    observer.observe(card)
})