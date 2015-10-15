/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boletin4b;

/**
 *
 * @author jbarrosgarcia
 */
public class Consume {
private float km;
private float litros;
private float vMed;
private float pGas;
public Consume(){
}
public Consume  (float km,float lit,float vMe,float pGa ){
        this.km=km;
        this.litros=lit;
        this.pGas=pGa;
        this.vMed=vMe;
}
public float getTempo(){
   float tiempo=0f;
   tiempo=vMed/this.km;
   return tiempo;
}
public void setKm(float km){
    this.km=km;
}
public void setLitros(float li){
    this.litros=li;
}
public void setPGas(float pGa){
    this.pGas=pGa;
}
public void setVMed(float vMe){
    this.vMed=vMe;
}
public float getConM(){
    float conM=(this.litros*100)/this.km;
    return conM;
}
public float getLit(){
    float litCon;
    litCon=this.litros;
    return litCon;
}
public float getVMed(){
    float vMedia=this.vMed;
    return vMedia;
}
}
