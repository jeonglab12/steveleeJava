// bind keydown
document.addEventListener("keydown", keyEvent);

/**
 * 이벤트 처리
 * @returns
 */
function keyEvent(e) {
	
	var xhr = new XMLHttpRequest();
	
	if (e.keyCode == 40 || e.keyCode == 38 || e.keyCode == 37 || e.keyCode == 39 || e.keyCode == 65) {
		
		var data = {
			keyCode : e.keyCode
		};
		
		xhr.open('POST', '/textRpgStart');
		xhr.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
		
		//응답 처리
		xhr.onreadystatechange = function() {
			
			var data = null;
			var $map = document.querySelector("#map");
			
			console.log("========== XHR STATUS : " + this.status + " ==========");
			
			if (this.readyState == 4 && this.status == 200) {
				
				data = JSON.parse(this.responseText);
				
				$map.innerHTML = data.game.map;
				
				updateDisplay(data.message);
			}
		}
		
	    xhr.send(JSON.stringify(data));
		
	} else {
		console.log("잘못된 키 입력");
	}
	
}

/**
 * 상태창에 메세지 표시하기
 * @param message
 * @returns
 */
function updateDisplay(message) {
	
	var $display = document.querySelector("#display");
	var messageId = generateUUID();
	
	var messageTag = document.createElement('p');
	
	messageTag.id = 'm' + messageId;
	messageTag.textContent = messageTag.id + ": " + message;
	
	$display.appendChild(messageTag);
	
	setTimeout(function(){
		messageTag.remove();
	}, 3000)
}

/**
 * 유니크ID 생성하기
 * @returns
 */
function generateUUID() {
	function s4() {
		return ((1 + Math.random()) * 0x10000 | 0).toString(16).substring(1);
	}
	return s4() + s4();
}

