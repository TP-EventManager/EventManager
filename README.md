# TODO

## DB Model

### User table

column      | type
------------|--------
email       | string (primary key)
first_name  | string
last_name   | string
password    | string
company     | string

### Event table

column         | type
---------------|--------
uuid           | string (primary key)
name           | string
adresse        | string
beginning_date | datetime
end_date       | datetime

### Subcription table

column      | type
------------|--------
user        | (foreign key to User)
event       | (foreign key to Event)
(username, event_id) | primary key

## Use cases

### User

action      | url
------------|--------
Get form to create user | GET  /new_user
Create user             | POST /new_user
Show user page          | GET  /user?email=EMAIL

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
Show subscribers of event | GET  /subscribers?event=UUID

### Event

action      | url
------------|--------
List Event               | GET  /events
Get form to create event | GET  /new_event
Create Event             | POST /new_event
Publish Event            | POST /publish
Show Event               | GET  /event?uuid=UUID
