print('Start #################################################################');

db = db.getSiblingDB('habitGoals');
db.createUser(
    {
        user: 'admin',
        pwd: 'Admin111',
        roles: [{role: 'readWrite', db: 'habitGoals'}],
    },
);

print('END #################################################################');