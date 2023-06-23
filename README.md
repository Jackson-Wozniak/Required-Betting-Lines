### Overview
A simple CLI application to calculate the betting lines
    required to break even or make a profit
    on a bet.

The calculations are based on the probability of
    the event in the bet happening, therefore
    the results are only correct in the long term

### Local Deployment

To run locally with Docker, run the following commands:
```
- git clone https://github.com/Jackson-Wozniak/Stock-Market-Simulation.git
- mvn clean package
- docker build -t required_betting_lines .
- docker run -i required_betting_lines
```