package Client;

import Team.Academy;

public class ApplicationStart {

    public static void main(String args[]){
        Academy futbolAcademy = new Academy();

        futbolAcademy.fillAcademy();

        futbolAcademy.showRoster();
    }
}
