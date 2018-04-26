var slideIndex = 0;
showSlides();

function showSlides() {
    var i;
    var slides = document.getElementsByClassName("mySlides");
    for (i = 0; i < slides.length; i++) {
        slides[i].style.display = "none"; 
    }
    slideIndex++;
    if (slideIndex > slides.length) {slideIndex = 1} 
    slides[slideIndex-1].style.display = "block"; 
    setTimeout(showSlides, 10000); // Change image every 10 seconds
}
function valideerData() {
	var waarde = document.getElementById("input1").value;  /* getElementById is een interne JavaScript methode */
	
	if(isNaN(waarde) || waarde == '') { /* NaN = not a number, een interne JavaScript functie */
		toevoeging = "niet ";
	}
	else {
		toevoeging = "wel ";
	}
	var conclusie = "De ingevulde waarde '"  + waarde + "'; dit is " + toevoeging  +"een geldig getal. ";
	alert(conclusie);
}