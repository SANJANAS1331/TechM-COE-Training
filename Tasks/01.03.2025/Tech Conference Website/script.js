document.addEventListener("DOMContentLoaded", function () {
    if (document.getElementById("countdown")) {
        startCountdown();
    }

    if (document.getElementById("speakerData")) {
        loadSpeakers();
    }

    if (document.getElementById("scheduleData")) {
        loadSchedule();
    }
});

function startCountdown() {
    const eventDate = new Date("March 30, 2025 00:00:00").getTime();

    setInterval(function () {
        let now = new Date().getTime();
        let timeLeft = eventDate - now;

        if (timeLeft <= 0) {
            document.getElementById("countdown").innerHTML = "The event has started!";
            return;
        }

        let days = Math.floor(timeLeft / (1000 * 60 * 60 * 24));
        let hours = Math.floor((timeLeft % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
        let minutes = Math.floor((timeLeft % (1000 * 60 * 60)) / (1000 * 60));
        let seconds = Math.floor((timeLeft % (1000 * 60)) / 1000);

        document.getElementById("countdown").innerHTML =
            `${days} Days ${hours} Hours ${minutes} Minutes ${seconds} Seconds`;
    }, 1000);
}

function loadSpeakers() {
    const speakers = JSON.parse(document.getElementById('speakerData').textContent);
    const speakerContainer = document.getElementById('speaker-container');

    speakerContainer.innerHTML = '';

    speakers.forEach((speaker, index) => {
        const speakerDiv = document.createElement('div');
        speakerDiv.classList.add('speaker');
        speakerDiv.innerHTML = `
            <img src="${speaker.image}" alt="${speaker.name}">
            <h3>${speaker.name}</h3>
            <p>Topic: ${speaker.topic}</p>
            <button type="button" onclick="showDetails(${index})">Know More</button>
            <div class="details" id="details-${index}" style="display: none;">
                <p>${speaker.details}</p>
            </div>
        `;
        speakerContainer.appendChild(speakerDiv);
    });
}

function showDetails(id) {
    const details = document.getElementById(`details-${id}`);
    details.style.display = details.style.display === 'none' ? 'block' : 'none';
}

function loadSchedule() {
    const data = JSON.parse(document.getElementById('scheduleData').textContent);
    const scheduleList = document.getElementById('schedule-list');
    const filter = document.getElementById('track-filter');

    function showSchedule(track) {
        scheduleList.innerHTML = '';
        const filtered = track === 'all' ? data : data.filter(item => item.track === track);
        filtered.forEach(item => {
            scheduleList.innerHTML += `<p><strong>${item.time}</strong> - ${item.topic}</p>`;
        });
    }

    filter.addEventListener('change', () => showSchedule(filter.value));
    showSchedule('all');
}
