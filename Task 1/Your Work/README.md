# WorkSync ER Diagram

Below is the Entity Relationship Diagram (ERD) structure for your **WorkSync** project.

---

# Main Entities

## 1. User

| Attribute    | Type                           |
| ------------ | ------------------------------ |
| user_id (PK) | ObjectId                       |
| name         | String                         |
| email        | String                         |
| password     | String                         |
| role         | Enum(Admin, Manager, Employee) |
| created_at   | Date                           |

---

## 2. Project

| Attribute       | Type     |
| --------------- | -------- |
| project_id (PK) | ObjectId |
| title           | String   |
| description     | Text     |
| start_date      | Date     |
| end_date        | Date     |
| manager_id (FK) | user_id  |

---

## 3. Task

| Attribute        | Type       |
| ---------------- | ---------- |
| task_id (PK)     | ObjectId   |
| title            | String     |
| description      | Text       |
| status           | Enum       |
| deadline         | Date       |
| project_id (FK)  | project_id |
| assigned_to (FK) | user_id    |

---

## 4. Report

| Attribute         | Type     |
| ----------------- | -------- |
| report_id (PK)    | ObjectId |
| generated_by (FK) | user_id  |
| generated_date    | Date     |
| report_type       | String   |

---

## 5. Notification

| Attribute            | Type     |
| -------------------- | -------- |
| notification_id (PK) | ObjectId |
| user_id (FK)         | user_id  |
| message              | Text     |
| status               | Boolean  |
| created_at           | Date     |

---

## 6. File

| Attribute        | Type       |
| ---------------- | ---------- |
| file_id (PK)     | ObjectId   |
| uploaded_by (FK) | user_id    |
| project_id (FK)  | project_id |
| file_name        | String     |
| file_url         | String     |

---

# Relationships

| Relationship                         | Type  |
| ------------------------------------ | ----- |
| One Manager manages many Projects    | 1 : M |
| One Project contains many Tasks      | 1 : M |
| One Employee works on many Tasks     | 1 : M |
| One User receives many Notifications | 1 : M |
| One Project contains many Files      | 1 : M |

---

# ER Diagram (Text Format)

```plaintext id="xvtxzh"
+------------------+
|      USER        |
+------------------+
| user_id (PK)     |
| name             |
| email            |
| password         |
| role             |
+------------------+
        |
        | 1
        |
        | M
+------------------+
|     PROJECT      |
+------------------+
| project_id (PK)  |
| title            |
| description      |
| manager_id (FK)  |
+------------------+
        |
        | 1
        |
        | M
+------------------+
|       TASK       |
+------------------+
| task_id (PK)     |
| title            |
| status           |
| project_id (FK)  |
| assigned_to(FK)  |
+------------------+

USER 1 ------ M NOTIFICATION
USER 1 ------ M REPORT
PROJECT 1 --- M FILE
```

---

# Professional ER Diagram Structure

```plaintext id="8e4fxw"
USER
-----
PK user_id
name
email
password
role

PROJECT
--------
PK project_id
title
description
FK manager_id

TASK
-----
PK task_id
title
description
status
deadline
FK project_id
FK assigned_to

REPORT
-------
PK report_id
report_type
generated_date
FK generated_by

NOTIFICATION
------------
PK notification_id
message
status
FK user_id

FILE
----
PK file_id
file_name
file_url
FK uploaded_by
FK project_id
```

---

# Recommended Relationships

* Admin → manages Users
* Manager → creates Projects
* Project → contains Tasks
* Employee → completes Tasks
* User → receives Notifications
* Project → stores Files

---

# Best Tools to Draw This ER Diagram

## Draw.io (Free)

[Draw.io (diagrams.net)](https://app.diagrams.net?utm_source=chatgpt.com)

---

## Lucidchart

[Lucidchart](https://www.lucidchart.com?utm_source=chatgpt.com)

---

## Canva ER Diagram Maker

[Canva ER Diagram Maker](https://www.canva.com/graphs/er-diagrams/?utm_source=chatgpt.com)

---

# Suggested MongoDB Collections

```plaintext id="g37m6u"
users
projects
tasks
reports
notifications
files
```

---

# Recommended Additional Tables (Optional)

| Entity      | Purpose               |
| ----------- | --------------------- |
| Comment     | Task discussions      |
| ActivityLog | User activity history |
| Team        | Team management       |
| Meeting     | Schedule meetings     |

---

If you want, I can also make:

* Full graphical ER diagram
* UML Use Case Diagram
* Sequence Diagram
* Context Diagram
* Activity Diagram
* Database Schema for MongoDB
* SQL version of ERD
* Mermaid ERD code
* Draw.io XML format

for your WorkSync project.
