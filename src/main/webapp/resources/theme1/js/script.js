window.onload = function () {
    recognizer.start();
};
    
// Создаем распознаватель
var recognizer = new webkitSpeechRecognition();

// Ставим опцию, чтобы распознавание началось ещё до того, как пользователь закончит говорить
recognizer.interimResults = true;

// Какой язык будем распознавать?
recognizer.lang = 'ru-Ru';

// Используем колбек для обработки результатов
recognizer.onresult = function (event) {
    var result = event.results[event.resultIndex];
    if (result.isFinal) {
        var resultString = result[0].transcript;
        if (resultString === 'список игроков') {
            window.location.href = "http://localhost:8000/pages/main.xhtml";
        } else if (resultString === 'на главную') {
            window.location.href = "http://localhost:8000/pages/welcome.xhtml";
        }
        // alert('Вы сказали: ' + result[0].transcript);
    } else {
        console.log('Промежуточный результат: ', result[0].transcript);
    }
};

function speech() {
    // Начинаем слушать микрофон и распознавать голос
    recognizer.start();
}

var synth = window.speechSynthesis;
var utterance = new SpeechSynthesisUtterance('How about we say this now? This is quite a long sentence to say.');

function talk() {
    synth.speak(utterance);
}

function stop() {
    synth.pause();
}
