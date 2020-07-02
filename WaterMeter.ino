#include <SPI.h>
#include <Wire.h>
#include <Adafruit_GFX.h>
#include <Adafruit_SSD1306.h>
#define OLED_RESET 4
#include "OakOLED.h"
OakOLED oled;

int X;
int Y;
//float TIME = 0;
float FREQUENCY = 0;
float WATER = 0; 
float TOTAL = 0;
float LS = 0;
const char input = 2;
long int time;  
void setup()
{
  Serial.begin(9600);
  delay(2000);
  pinMode(input,INPUT);
  oled.begin();
}
void loop()
{
  X = pulseIn(input, HIGH);
  Y = pulseIn(input, LOW);
  FREQUENCY = 1000000/(X+Y);
  WATER = FREQUENCY/7.5;
  LS = WATER/60;
  time = millis();
  if(FREQUENCY >= 0)
  {
    if(isinf(FREQUENCY))
    {
        WATER = 0;
        Serial.print(float(WATER));
        //Serial.print("l/m");
        Serial.print(":");
        Serial.print( float(TOTAL));
        //Serial.print("L total");
        Serial.print(":");
        Serial.print(time);
        Serial.print(":");
        Serial.println("");
        data();
    
    }
    else
    {
    TOTAL = TOTAL + LS;
        //Serial.println(FREQUENCY);
        Serial.print(float(WATER));
        //Serial.print("l/m");
        Serial.print(":");
        Serial.print( float(TOTAL));
        //Serial.print("L total");
        Serial.print(":");
        Serial.print(time);
        Serial.print(":");
        Serial.println("");
        data();
    }
  }
  else
  {
     WATER = 0;
     data();
  }
  delay(500);

}

void data(){
    oled.clearDisplay();
    oled.setTextSize(1);
    oled.setTextColor(1);
    oled.setCursor(0, 0);
    oled.println("Flow rate");
    oled.setTextSize(2);
    oled.setCursor(10, 12);
    oled.println(WATER);
    oled.setTextSize(2);
    oled.setCursor(80, 12);
    oled.println("l/m");
    
    
    oled.setTextSize(1);
    oled.setTextColor(1);
    oled.setCursor(3, 29);
    oled.println("Total Volume");
    oled.setTextSize(2);
    oled.setTextColor(1);
    oled.setCursor(10,40 );
    oled.println(TOTAL);
    oled.setCursor(80, 40);
    oled.println("lit");
    oled.display();
  }
