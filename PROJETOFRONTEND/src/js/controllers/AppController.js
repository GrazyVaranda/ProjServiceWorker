export class AppController {
    constructor() {
        console.log("Construtor do AppController rodou!!!");
        this.initialize();
    }

    initialize() {
        let btnToggleDrawer = document.getElementById("btnToggleDrawer");
        if (btnToggleDrawer) {
            btnToggleDrawer.addEventListener('click', (evt) => {
                console.log(evt);
                this.mostraMenuDrawer();
            });
        }
    }

    mostraMenuDrawer() {
        let drawerElm = document.getElementById("drawerMenu");
        if (drawerElm) {
            drawerElm.style.display = 'block';
        }
    }
}
