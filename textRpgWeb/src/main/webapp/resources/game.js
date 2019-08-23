// bind keydown
document.addEventListener("keydown", keyEvent);

/**
 * 이벤트 처리
 * @returns
 */
function keyEvent(e) {
	
	var xhr = new XMLHttpRequest();
	
	if (e.keyCode == 40 || e.keyCode == 38 || e.keyCode == 37 || e.keyCode == 39) {
		
		var data = {
			keyCode : e.keyCode
		};
		
		xhr.open('POST', '/textRpgStart');
		xhr.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
		
		//응답 처리
		xhr.onreadystatechange = function() {
			
			var $map = document.querySelector("#map");
			
			if (this.readyState == 4 && this.status == 200) {
				
				var data = JSON.parse(this.responseText);
				
				$map.innerHTML = data.map;
			}
		}
		
	    xhr.send(JSON.stringify(data));
		
	} else {
		console.log("잘못된 키 입력");
	}
	
}


