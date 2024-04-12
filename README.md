# Quarkus and Rule Engine

A sample Java project that involved Quarkus, Kogito, and Drools to display the capability of `Rule Engine` on top of Quarkus. It provides a rest API endpoint with a specific JSON format for request and response.

## Build
```
$ mvn clean package -s settings.xml
```

## Run
```
$ java -jar .\target\quarkus-app\quarkus-run.jar
```

## Test
```
curl --location --request POST 'http://localhost:8080/get-gst' \
--header 'content-type: application/json' \
--header 'accept: application/json' \
--data-raw '{
    "gst": [
        {
            "state": "Haryana",
            "isStateExempt": true 
        }
    ]
}'
    
[
    {
        "stateTax": 22,
        "centralTax": 0,
        "state": "Haryana",
        "stateExempt": false
    }
]
```
