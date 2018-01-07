# Feedbacks
`Last version: 0.1`
## Docker compose
- Build app: mvn clean package
- Run: docker-compose up --build

## Endpoints
App is accessible on port 8088.
Example call: `{IP}:8088/v1/feedbacks/accommodation/1`

###Feedbacks
* `GET: /v1/feedbacks/accommodation/{accommodationId}` Returns feedbacks of accommodation with accommodationId
* `GET: /v1/feedbacks/user/{userId}` Returns list of feedbacks for user with userId

### Config
* `GET: /v1/config` Returns all configurable values

### Health
* `GET: /health` Returns info about service health
* `POST: /v1/health-demo/healthy` Changes config value `healthy` (parameter is boolean) 

### Metrics
* `GET: /metrics` Returns metrics