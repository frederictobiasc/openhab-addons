# Fröling Lambdatronic 3200 Modbus Binding

## Design
Modbus Lambdatronic is used in pellet (P), fire wood (S), wood chip (H) or fire wood + pellet (SP) boilers. -> Some registers might not be available on all versions.1

Idea: We specify all existing settings in the thing-types, but delete them according to the config.xml.

### Input registers

#### Not implemented
Some registers are out of scope in the current version. These registers are:

30701 - 30712: Networks
30801 - 30803: Difference regulation
30901 - 30926: Boiler cascades

#### Heating circuits
The control supports up to 18 heating ciruits. Implement an option to just display the necessary heating circuits.

#### Boilers
The control supports up to 8 boilers. See heating circuits.

#### Buffers
The control supports up to 4 buffers. See heating circuits.

#### Solar System

#### Holding registers
- 40001 Boiler target temperature
- 40320 Pelletlager Restbestand

#### Remote Control
- Flow target temperatures
- Boiler target Temperatures
- 48027: Activate remote burner control
- 48028: Power setting (30-100), at least 35 necessary to start automatic boilers (P, H)
Must be written at least all 2 Minutes, otherwise it get's deactivated

#### Plant and boiler condition
- 33001: Error
- 34001: Plant condition
- 34002: Boiler condition

#### TODO
- [X] find out type for speed (UPM)
- [ ] Exception handling
- [ ] Move distinct write registers in the background and link them to the corresponding readings.

#### Steuerungsidee
- Der Pufferspeicher soll nachts langsam entladen/kalt werden. Dazu soll der Speicher (nach 17:00) nur soweit erhitzt werden, dass der Wärmebedarf für den restlichen Tag abgedeckt ist.