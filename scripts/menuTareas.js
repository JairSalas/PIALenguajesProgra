
//nooooooooooooooooooo
// Obtener los botones de anterior y siguiente
const botonAnterior = document.getElementById('anterior');
const botonSiguiente = document.getElementById('siguiente');

/// Definir las páginas disponibles
const paginas = 
['tarea1.html',
 'tarea2.html',
'tarea3.html',
'tarea4.html',
'tarea5.html',
'tarea6.html',
'tarea7.html',
'tarea8.html',
'tarea9.html',
'tarea10.html',
'tarea11.html',]; // Agrega aquí las URLs de tus páginas
// Manejar el clic en el botón de anterior
botonAnterior.addEventListener('click', () => {
    // Obtener el índice de la página actual desde el atributo data-indice
    const indiceActual = parseInt(botonAnterior.getAttribute('data-indice'));
    // Calcular el índice de la página anterior
    const indiceAnterior = (indiceActual - 1 + paginas.length) % paginas.length;
    // Redirigir a la página anterior
    window.location.href = paginas[indiceAnterior];
});

// Manejar el clic en el botón de siguiente
botonSiguiente.addEventListener('click', () => {
    // Obtener el índice de la página actual desde el atributo data-indice
    const indiceActual = parseInt(botonSiguiente.getAttribute('data-indice'));
    // Calcular el índice de la página siguiente
    const indiceSiguiente = (indiceActual + 1) % paginas.length;
    // Redirigir a la página siguiente
    window.location.href = paginas[indiceSiguiente];
});

