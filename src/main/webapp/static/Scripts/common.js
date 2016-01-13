function goToPage(page, fromFirstPage) {
	console.log("Entered goToPage with:" + page);
	if(fromFirstPage == true) {
		window.location = "static/html/" + page;		
	} else {
		window.location = page;
	}
}