
//http request function
function api(url) {
    let solicitation = new XMLHttpRequest()
    //get information from url
    solicitation.open ("GET", url, false)
    solicitation.send()
    return solicitation.responseText

}


function cod() {

    //world clock request using api function
    let time = api("http://worldclockapi.com/api/json/utc/now")

    //parse JSON data
    let clock = JSON.parse(time);

    //add data to html page using the element Id
    document.getElementById("content").innerHTML = clock.currentDateTime
    document.getElementById("content2").innerHTML = clock.dayOfTheWeek
    
      
    //log
    console.log(clock)

}

//call function
cod()