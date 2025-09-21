import { StatusBar } from "expo-status-bar";
import { useEffect, useState } from "react";
import { StyleSheet, Text, View } from "react-native";
import { getLatestGames } from "./lib/metacritic";

export default function App() {
  const [games, setGames] = useState([]);
  useEffect(() => {
    getLatestGames().then((games) => {
      setGames(games);
    });
  }, []);

  return (
    <View style={styles.container}>
      <StatusBar style="light"></StatusBar>
      {games.map((game) =>(
        <View key={game.slug} style={styles.card}>
          <Image source={{ uri: games.image }} style={styles.image}></Image>
          <Text style={styles.title}>{game.title}</Text>
          <Text style={styles.score}>{game.score}</Text>
        </View>
      ))}

    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "#fff",
    alignItems: "center",
    justifyContent: "center",
  },
  card: {
    marginBottom:10,
  },
  image: {
    width: 107,
    height: 147,
    borderRadius: 10,
  },
  title:{
    fontSize:20,
    fontWeight:"bold",
    marginBottom:10,
    color:"#fff",
  },
  score:{
    fontSize:20,
    color: "green",
    fontWeight: "bold",
    marginTop:10
  }
});
