import { AppController } from "./AppController.js";

class App {
    constructor(appCtr) {
        this.appController = appCtr;
    }
}

let appInstance = new App(new AppController());
export { appInstance };