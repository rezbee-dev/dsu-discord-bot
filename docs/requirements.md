# Project Requirements

Document to plan and track features

## Functional Requirements

### "Flashcards"

API that allows users to create, read, modify, and delete "flashcard" items via Discord Commands & Message Components 

Models
- QA
  - "Question & Answer" item
  - Fields
    - Id (Int, Required)
    - Question (String, Required)
    - Answer (String, Required)
    - Category (String, Nullable)
    - Original Author (Int, Required, Discord User ID)
    - Created (DateTime, Required)
    - LastModified (DateTime, Nullable)

- Category
  - Category for "QA" items
  - Fields
    - Id (Int)
    - Name (String)

- User
  - Discord User
  - Fields
    - Id (Int - from discord)
    - Username (String - global_name, aka "nickname" in discord)
    - Roles (Set<String>)

End User Operations
- Create
  - Adds valid QA item to database 
  - Restrictions
    - Requires "Trusted" or "Mod" roles
    - Duplicate "question" not allowed
- Modify
  - Modifies existing QA item
  - Restrictions
    - Requires "Trusted" or "Mod" roles
    - Duplicate "question" not allowed
      - Can't modify Question field if theres already another QA item with the same one
- Delete
  - Removes QA item
  - Restrictions
    - Requires "Mod" roles
- Propose
  - Adds Unverified QA items for approval to be added to the database
  - Gist: Allow server members to "propose" QA items that can be reviewed/ modified before its actually added to the database - kinda like how wiki requires discussions/ approval before certain edits are made
  - No restrictions
- View
  - Retrieve QA item from the database

