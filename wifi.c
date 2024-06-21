#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <iwlib.h>

int main() {
    wireless_scan_head head;
    wireless_scan *result;
    iwrange range;
    int sock;

    // Open socket to kernel
    sock = iw_sockets_open();
    if (sock < 0) {
        perror("socket");
        return -1;
    }

    // Get range information
    if (iw_get_range_info(sock, "wlan0", &range) < 0) {
        fprintf(stderr, "Error getting range info.\n");
        return -1;
    }

    // Perform scan
    if (iw_scan(sock, "wlan0", range.we_version_compiled, &head) < 0) {
        fprintf(stderr, "Error scanning.\n");
        return -1;
    }

    // Print results
    result = head.result;
    while (NULL != result) {
        printf("SSID: %s\n", result->b.essid);
        result = result->next;
    }

    // Close socket
    iw_sockets_close(sock);
    return 0;
}
