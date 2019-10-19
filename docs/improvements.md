- The Incident domain object as represented by the included JSON file is too verbose and incorrect.
Since the same request will be used for testing the domain object cannot be changed.
    - When invoking POST /incidents then no address or fire department rows should be created
    hence no data for these entities should be in the request 
    - The incident should only have the following:
          - address_id
          - description as is with no id
          - fire_department_id
          - for simplicity and excluded apparatus for implementation and discussion
          but the same principle applies there


- think about the right type for numbers like latitude and longitude
- fix class names Fire_department
- real DB not H2
- map apparatus/"cars" using many-to-many list
- think about better & type consistent entity ID generator
- break down monolith API to smaller footprint dedicated purposely build APIs
- think about lazy loading but not here where ALL is returned
- add data request validator
- remap table and column names
- get by id should return 404 when not found / add exception mapper
- create Incident random data generator for unit/integration testing
- support update with PUT
- investigate error when running tests: org.h2.jdbc.JdbcSQLSyntaxErrorException: Column "start_value" not found
- secure API (SSL, authentication, authorization)
- implement  update (with one of Hibernate lock mode like optimistic)
- add weather service url to config (property file, system/env prop)
- handle errors for weather service url 