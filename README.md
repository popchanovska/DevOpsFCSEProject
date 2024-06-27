# Апликација
Веб апликација за преглед, додавање и бришење на вработени во компанија.

## Docker
docker compose up

## Kubernetes
k3d cluster create devops-cluster -p "8088:80@loadbalancer"
kubectl apply -f namespace.yaml 
kubectl apply -f configmap.yaml
kubectl apply -f secret.yaml
kubectl apply -f statefulset.yaml
kubectl apply -f deployment.yaml 
kubectl apply -f app-service.yaml 
kubectl apply -f db-service.yaml
kubectl apply -f ingress.yaml 
