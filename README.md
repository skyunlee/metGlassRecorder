#Audio Recording App for Glass

##Project Description
This is an initial prototype for a glassware that allows users to take a photo of an artwork and record their verbal description of the piece. It is intended as a tool for crowdsourcing audio descriptions of artworks in museums, so that the recorded contents can be used by museum by museum visitors with low vision. This project was done during my internship at the Metropolitan Museum of Art between January-May 2014. 

##Running the code
This application was written in Eclipse using the ADT Plugin. If you are to run it on an emulator in Eclipse, you will have to set up your own virtual device that has the dimensions of a Google Glass, as the Glass' screen size is not there by defualt.

1. First, go to Window -> Android Virtual Device Manager
2. In the popup window, select "Device Definitions"
3. Click "New Device" on the upper right hand corner
4. Enter the details:
5. Screen size: 3.0"
6. Resolution: 640 x 360px
7. Input: uncheck "Keyboard" and check DPad
8. RAM: 512 MiB
9. Size: Small
10. Screen ratio: Long
11. Density: hdpi
12. Buttons: hardware
13. Click "Create Device" in the lower right hand corner
14. Now that you've created the device, you can select it when you're running the app. 

If you are trying to run it on the actual device, then you just need to connect your Glass to the laptop and run it in Eclipse. The Glass needs to have the debug mode turned ON. When you run the code, select "Run as Android Application" and then in the window that pops up, select your Google Glass.
