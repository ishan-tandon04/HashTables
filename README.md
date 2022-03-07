# HashTables
Challenge 1: x % n where n is a large prime number makes for a much better hash function because we are able to get a specific number. If we have a number that has multiple factors then there could be an infinite amount of factors. Example: 2500%211=179 (unique to these specific numbers).
Challenge 2: It is not a good hash function because a portion of values will become the same integer values. It will take longer to parse through and could possibly not catch errors.
Challenge 3: There are null keys and null values. This then leads to certain "sections" that these variables are stored in. By creating a certain amount of sections, we can fill up the values, but once the entire hashmap is covered it resizes itself so that it is now twice the number of sections.
