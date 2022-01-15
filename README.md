# Build plan

## Database
![Database](plan/DatabaseStructure.png)

## Entities
![Class](plan/ClassStructure.png)

## Services
![Service](plan/ServiceClasses.png)

# Install instructions

1. Build the Dockerfile in root folder with `docker build -t habitgoals .` - *This creates an image with habitgoals tag*
2. Start the application from the `./docker` folder with `docker-compose up -d` - *Don't forget to start Docker*