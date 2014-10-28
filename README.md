# TODO

## DB Model

### User table

column      | type
------------|--------
email       | string (primary key)
password    | string

### Event table

column         | type
---------------|--------
id           | integer (primary key)
name           | string
adresse        | string
beginning_date | datetime
end_date       | datetime
published  | boolean
email       | (foreign key to User)

### Subcription table

column      | type
------------|--------
email          | string
first_name  | string
last_name   | string
company     | string
event       | (foreign key to Event)

## Use cases

### User

action      | url
------------|--------
Get form to create user | GET  /new_user
Create user             | POST /new_user

### Session

action      | url
------------|--------
Get form to login | GET  /login
Login             | POST /login
Logout            | POST /logout

### Subcription

action      | url
------------|--------
Subcribe to event         | POST /subscribe
Show subscribers of event | GET  /subscribers?event=ID

### Event

action      | url
------------|--------
List Event               | GET  /events
Get form to create event | GET  /new_event
Create Event             | POST /new_event
Publish Event            | POST /publish
Show Event               | GET  /event?id=ID
