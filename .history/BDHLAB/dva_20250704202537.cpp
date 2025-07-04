
#include <stdio.h>
#define INF 9999
#define MAX 10

int main() {
    int nodes, cost[MAX][MAX], dist[MAX][MAX], next[MAX][MAX], updated;

    printf("Enter number of nodes: ");
    scanf("%d", &nodes);

    printf("Enter cost matrix (use %d for INF):\n", INF);
    for (int i = 0; i < nodes; i++)
        for (int j = 0; j < nodes; j++) {
            scanf("%d", &cost[i][j]);
            dist[i][j] = cost[i][j];
            next[i][j] = (cost[i][j] != INF && i != j) ? j : -1;
        }

    do {
        updated = 0;
        for (int i = 0; i < nodes; i++)
            for (int j = 0; j < nodes; j++)
                for (int k = 0; k < nodes; k++)
                    if (dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                        next[i][j] = next[i][k];
                        updated = 1;
                    }
    } while (updated);

    for (int i = 0; i < nodes; i++) {
        printf("Routing table for node %d:\n", i);
        printf("Dest\tNextHop\tDist\n");
        for (int j = 0; j < nodes; j++) {
            if (dist[i][j] == INF)
                printf("%d\t-\tINF\n", j);
            else
                printf("%d\t%d\t%d\n", j, next[i][j], dist[i][j]);
        }
        printf("\n");
    }

    return 0;
}
