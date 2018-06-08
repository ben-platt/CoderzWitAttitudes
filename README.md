# CoderzWitAttitudes
Fiona Cai, Kayli Matsuyoshi, Benjamin Platt
Straight Outta 251
APCS2 pd1

## Island Survival Game
For our final project, we decided to make an Island Survival Game. The goal of the game is to stay alive in an island setting as long as possible. The game will ask the user to do different things, such as forage for sources of food, water, shelter, and other resources. User will hunt, fish, and gather plants for food and resources.

## What our project presents to a user
Our project will be terminal-based because we did not have the time nor the expertise to implement this in processing. We use scanners to read the input of users through numbers to represent different choices. Based on the input of the user, we will then take different actions in the game and return the result of those actions to the user.

## How Our Project Works
We created a game from the point of view of a player, so all user input will be interpreted from the player's viewpoint. When the game begins the player enters their height, weight, and age. Through the BMI and age of the player, a maximum nutrition value will be calculated. The player and island are then created. They are then presented with six choices: Hunt, gather, shelter, fish, eat, or list items. There are further sub-options within each of these categories and various choices, such as eating, hunting, or sleeping, will affect a player's health. The game ends once a player's health reaches 0.

## Launch Instructions:
1. Clone Repo
2. ```$ cd CoderzWitAttitudes ```
3. ```$ javac Woo.java```
4. ```$ java Woo```
5. Enter your personal statistics and begin your adventure!
