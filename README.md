# springsecurity

Project Name: Tournament Record-System

(Authenticated) Roles:
Admin
Team Manager
Officials

(Unauthenticated) Roles:
Fans

Requirements per role:
Admin
Can approve registration and edit team info
Cannot create or edit teams
Can view all teams, tournament records, etc
Can disable (team manager) access
Can create/edit/disable tournament official’s account
Can create/edit/delete game

Team Manager
Can register team (team name, category/game, team members) - needs admin approval
Can edit team info (team name, team members) - needs approval
Can see team’s record

Tournament Official
Send the result (edit is not possible)

Fans 
View recent tournament’s result (winner-losser, score/points, date)
View team’s record (team members, how many wins/losses, finished/upcoming games)
View upcoming tournament (sorted by date)
(optional) 3rd party:
A public-API which can be used by any 3rd party (this returns a JSON)

Properties:
Admin
ID
Username
Password

Official:
ID
Full name
enable/disable access

Team:
ID
Name
Game
ID
Category

Team Manager
ID
Team Id
Full name
enable/disable access

Player
Team Id
Game ID
Full name

Game Record
Game ID
Date/time
Description (team name vs team name)

Game Record Result
Game Record ID
Team ID
Official ID
Score

MVP:
Implement properly the back-end using Spring Security
Important roles (for Authentication):
(Admin,Team Manager,Official)
Text-based result/view (only add good UI when everything is done)
Make sure to have a table containing logs/events

