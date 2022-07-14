public class Fecha
{
    //-----------
    // Atributos
    //-----------
    protected int dia;
    protected int mes;   
    protected int anio;
    //private String fecha;

    
    //-----------
    // Métodos
    //-----------

    public Fecha()
    {


    }
    public Fecha(int d, int m, int a )
    {
        dia = d;
        mes = m;
        anio = a;
    }

    public Fecha(String s)
    {
        int pos1 = s.indexOf('/');
        int pos2 = s.lastIndexOf('/');

        String sDia = s.substring(0, pos1);
        dia = Integer.parseInt(sDia);

        String sMes = s.substring(pos1 + 1,pos2);
        mes = Integer.parseInt(sMes);

        String sAnio = s.substring(pos2+1);
        anio = Integer.parseInt(sAnio);
    }

    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String toString() 
    {   
        return dia + "/" + mes + "/" + anio;
    }
    
    public boolean equals(Object o)
    {
        Fecha otra = (Fecha)o;
        return (this.dia == otra.dia) && (this.mes==otra.mes) && (this.anio == otra.anio);
    }

    public void addDias(int d)
    {
        fechaToDias();
        dia += d;
        diasToFecha();
    }

    private void fechaToDias()
    {
        dia = dia + 30*mes + 360*anio;
    }

    private void diasToFecha()
    {
        anio = dia/360;
        mes = (dia/30) - 12*anio;
        dia = dia - 360*anio - 30*mes;
        
    }

}