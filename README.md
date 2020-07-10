# SmartWaterMeter
An IOT based water monitoring system

# Introduction

The product Smart Water Meter primarily focusses on the economic aspect of water scarcity by providing measures of combining existing infrastructure with measurement and networking capabilities to collect data. The data collected will prove to be a valuable resource in management of infrastructure. The highlight issues with our urban water supply are:

• Poor Maintenance of supply line i.e. - pipe lines, joints, cisterns etc.
• Unequal distribution in various parts of the city.
• Water leakage in pipes and storage.
• Citizen negligence and illegal ground water supply.

The developed prototype provides features which helps in addressing all the above-mentioned issues. Smart water meter provides real time data monitoring on user application which allows them to view flow rate and total consumption of water live on the app. The user can set their daily water goals exceeding which they will be notified immediately. The application allows the user to synchronise the local water data to an online cloud database which can be later accessed by the user or supplier for referring to the water use and goal. along with this a website has also been made which allows the user to visualise the data in form of various graphs. The hardware used is very cost effective and compact. The Atmega328p microprocessor has been used along with YF-S201 flow sensor. These sensors collect the data and sends over to the app using a Bluetooth module.

# Hardware

The components required are:
>• Arduino UNO/Nano | ESP8266
>• YFS201 flow meter
>• HC-05 Bluetooth module
>• OLED SSD1306 
>• Breadboard| PCB
>• Android smartphone
  
The schematics and breadboard circuit designs are in the master branch.

# Android app

The app is in the apk format in the master branch you can install it on your phone. THe code is raw java file in java.main and the gradle files are in zip file. 

# Website

The address for the website is https://gurnameh-99.github.io/SmartWaterMeter/
the code is also in the master branch.

Here is a working video of the project if you are interested - https://youtu.be/M_hitbsmfF0
