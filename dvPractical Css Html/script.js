function generateChart() {
    const chartType = document.getElementById('chartType').value;
    const dataInput = document.getElementById('data').value;
    const data = dataInput.split(',').map(Number);

    const ctx = document.getElementById('myChart').getContext('2d');
    const myChart = new Chart(ctx, {
        type: chartType,
        data: {
            labels: Array.from({ length: data.length }, (_, i) => `Label ${i + 1}`),
            datasets: [{
                label: 'Data',
                data: data,
                backgroundColor: 'rgba(54, 162, 235, 0.2)',
                borderColor: 'rgba(54, 162, 235, 1)',
                borderWidth: 1
            }]
        },
        options: {
            responsive: true,
            maintainAspectRatio: false,
            scales: {
                y: {
                    beginAtZero: true
                }
            }
        }
    });
}
