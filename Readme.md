Prerequisites:
Running from a Windows host assumed.
An X server is installed on the host

Pre build:
Start your X server (e.g. Xming) and paste its IP address for DISPLAY in line 5 of docker-compose.yml

Build:
Run `docker-compose build` from terminal
If running from linux host run these:
`sysctl -w vm.max_map_count=262144`
`sysctl -w fs.file-max=65536`
`ulimit -n 65536`
`ulimit -u 4096`

Running:
Run `docker-compose up` to start and use Ctrl+C to stop

Video: https://pitt-my.sharepoint.com/:v:/g/personal/emt68_pitt_edu/EQuxlge7X_lGv12W9ZmmZa8BBKhQqln9Bd3ZgqT83evQcQ?e=6OYWkg
