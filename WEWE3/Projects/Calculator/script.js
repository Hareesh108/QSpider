let pick = Array.from(document.getElementsByClassName('pick'));
let display = document.getElementById('child1');

pick.map((pick) => {
  pick.addEventListener('click', (e) => {
    switch (e.target.innerText) {
      case 'Clear':
        display.innerText = '';
        break;
      case '=':
        try {
          display.innerText = eval(display.innerText);
        } catch {
          display.innerText = 'Error';
        }
        break;
      case '←':
        if (display.innerText) {
          display.innerText = display.innerText.slice(0, -1);
        }
        break;
      default:
        display.innerText += e.target.innerText;
    }
  });
});
