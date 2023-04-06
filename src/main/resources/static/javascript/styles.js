function toggleCarousel(back = false){
    let active = Number(document.querySelector('.active-slide').innerText);
    if(back)
        if(active > 1){
            document.getElementById('recfilm' + active).classList.remove('active');
            active -= 1;
            document.querySelector('.active-slide').innerText = active;
            document.getElementById('recfilm' + active).classList.add('active');
        }
        else{}
    else
        if(active < 3){
            document.getElementById('recfilm' + active).classList.remove('active');
            active += 1;
            document.querySelector('.active-slide').innerText = active;
            document.getElementById('recfilm' + active).classList.add('active');
        }

}
