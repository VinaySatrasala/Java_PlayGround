// Alpha α = n/m 
// n = number of keys(Currentlt filled)
// m = size of table
// α is called load factor


public class MapUsingHash {
    public class Entity{
        String key;
        String value;

        public Entity(String key , String value){
            key = this.key;
            value = this.value;
        }
    }

    private Entity[] entities;

    public MapUsingHash() {
        entities = new Entity[100];
    }

    public void put(String key , String value){
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key, value); // overriding the previous one
    }

    public String get(String key){
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key)){
            return entities[hash].value;
        }

        return null;
    }

    public void remove(String key){
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key)){
            entities[hash] = null;
        }
    }

    
}
