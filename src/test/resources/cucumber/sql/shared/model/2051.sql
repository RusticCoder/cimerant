CREATE TABLE geo (
    coordinate JSON,
    CHECK(
        JSON_SCHEMA_VALID(
           '{
               "type":"object",
               "properties":{
                 "latitude":{"type":"number", "minimum":-90, "maximum":90},
                 "longitude":{"type":"number", "minimum":-180, "maximum":180}
               },
               "required": ["latitude", "longitude"]
           }',
           coordinate
        )
    )
)
