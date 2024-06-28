package model;

public class CalcularMCM {
    int mcm;


    public int validarNumero(int num){
        if (num < 1){
            return 1;
        }else if (num > 100){
            return 100;
        }
        return num;
    }

    public int clacularMCM(int a, int b){
        int mcm = Math.max(a,b);
        while (mcm % Math.min(a,b) != 0){
            mcm += Math.max(a, b);
        }
        return mcm;
    }

    public int getMcm() {
        return mcm;
    }

    public void setMcm(int mcm) {
        this.mcm = mcm;
    }
}
