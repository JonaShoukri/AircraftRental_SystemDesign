# AircraftRental_SystemDesign
 This is a console aircraft rental simulator the point of this application is to demonstrate my system design skills. It is functionally not very impressive but the design patterns and implementation is some of my best work. I urge you to open the UML diagram to better understand the design and patterns utilized in this application.

This is a complex aircraft rental program with flight simulation capabilities. 

When run, the user is asked which plane he would like to try flying. Once one is chosen, the simulation starts. You can then start the plane, turn it off, take off, land, change altitude, fix aircraft, check current status, etc…

You can always press exit to leave the plane and press exit again in the main menu in order to exit the application completely.

System design:

For a treat, check out the UML diagram included in the folder to see the complexity of the system.

When user chooses an aircraft the system calls an abstract aircraft factory that, in turn, calls either a helicopter builder pattern or an airplane builder. The two mentioned builders need and engine tho… That’s when they outsource this task to an EngineFactory. (AbstractAircraftEngine -> HelicopterBuilder/AirplaneBuilder -> EngineFactory).

Both helicopter and airplane objects inherit from the aircraft class. This aircraft class uses multiple state design patterns in order to do its job (on/off, functional/nonfunctional, landed/not landed, landing/ not landing). Each state used in the state design patterns is also considered a singlton object in order to avaoid unecessary repetition.

