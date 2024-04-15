export class AppController {
    constructor() {
        console.log("Construtor do AppController rodou!!!");
        this.initialize();
    }

    initialize() {
        let btnToggleDrawer = document.getElementById("btnToggleDrawer");
        if (btnToggleDrawer) {
            btnToggleDrawer.addEventListener('click', (evt) => {
                console.log("O botão foi clicado!");
                this.mostraMenuDrawer();
            });
        }
        console.log("Javascript foi carregado e iniciado")
    }

    mostraMenuDrawer() {
        let drawerElm = document.getElementById("drawerMenu");
        if (drawerElm) {
            drawerElm.style.display = 'block';
        }
    }
}
