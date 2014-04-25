
#include "../include/jadl_sdk.h"

static void * _hDLL;

static int _jadl_is_init = 0;

#if defined (LINUX)
// equivalent functions in linux
static void * GetProcAddress( void * pLibrary, const char * name)
{
    return dlsym( pLibrary, name);
}

static void Sleep( int time)
{
    usleep(time*1000);
}

#endif


// Memory allocation function
static void * __stdcall JADL_Main_Memory_Alloc(int iSize)
{
	void *lpBuffer = malloc(iSize);
	return lpBuffer;
}

ADL_MAIN_MALLOC_CALLBACK __stdcall getFunction_JADL_Main_Memory_Alloc()
{
	return (ADL_MAIN_MALLOC_CALLBACK) JADL_Main_Memory_Alloc;
}

// Optional Memory de-allocation function
static void __stdcall JADL_Main_Memory_Free (void **lpBuffer)
{
	if (*lpBuffer) {
		free (*lpBuffer);
		*lpBuffer = NULL;
	}
}

static	ADL_MAIN_CONTROL_CREATE					_ADL_Main_Control_Create;
static	ADL_MAIN_CONTROL_DESTROY				_ADL_Main_Control_Destroy;
static	ADL_ADAPTER_NUMBEROFADAPTERS_GET		_ADL_Adapter_NumberOfAdapters_Get;
static	ADL_ADAPTER_ADAPTERINFO_GET				_ADL_Adapter_AdapterInfo_Get;
static	ADL_ADAPTER_ID_GET						_ADL_Adapter_ID_Get;
static	ADL_OVERDRIVE5_TEMPERATURE_GET			_ADL_Overdrive5_Temperature_Get;
static	ADL_OVERDRIVE5_CURRENTACTIVITY_GET		_ADL_Overdrive5_CurrentActivity_Get;
static	ADL_OVERDRIVE5_ODPARAMETERS_GET			_ADL_Overdrive5_ODParameters_Get;
static	ADL_OVERDRIVE5_FANSPEEDINFO_GET			_ADL_Overdrive5_FanSpeedInfo_Get;
static	ADL_OVERDRIVE5_FANSPEED_GET				_ADL_Overdrive5_FanSpeed_Get;
static	ADL_OVERDRIVE5_FANSPEED_SET				_ADL_Overdrive5_FanSpeed_Set;
static	ADL_OVERDRIVE5_ODPERFORMANCELEVELS_GET	_ADL_Overdrive5_ODPerformanceLevels_Get;
static	ADL_OVERDRIVE5_ODPERFORMANCELEVELS_SET	_ADL_Overdrive5_ODPerformanceLevels_Set;
static	ADL_MAIN_CONTROL_REFRESH				_ADL_Main_Control_Refresh;
static	ADL_OVERDRIVE5_POWERCONTROL_GET			_ADL_Overdrive5_PowerControl_Get;
static	ADL_OVERDRIVE5_POWERCONTROL_SET			_ADL_Overdrive5_PowerControl_Set;
static	ADL_OVERDRIVE5_FANSPEEDTODEFAULT_SET	_ADL_Overdrive5_FanSpeedToDefault_Set;

int ADL_Main_Control_Create(ADL_MAIN_MALLOC_CALLBACK callback, int iEnumConnectedAdapters)
{
	return _ADL_Main_Control_Create(callback,iEnumConnectedAdapters);
}

int ADL_Main_Control_Destroy()
{
	return _ADL_Main_Control_Destroy();
}

int ADL_Adapter_NumberOfAdapters_Get(int *lpNumAdapters)
{
	return _ADL_Adapter_NumberOfAdapters_Get(lpNumAdapters);
}

int ADL_Adapter_AdapterInfo_Get(AdapterInfo *lpInfo, int iInputSize)
{
	return _ADL_Adapter_AdapterInfo_Get(lpInfo,iInputSize);
}

int ADL_Adapter_ID_Get(int iAdapterIndex, int *lpAdapterID)
{
	return _ADL_Adapter_ID_Get(iAdapterIndex,lpAdapterID);
}

int ADL_Overdrive5_Temperature_Get(int iAdapterIndex, int iThermalControllerIndex, ADLTemperature *lpTemperature)
{
	return _ADL_Overdrive5_Temperature_Get(iAdapterIndex,iThermalControllerIndex, lpTemperature);
}

int ADL_Overdrive5_CurrentActivity_Get(int iAdapterIndex, ADLPMActivity *lpActivity)
{
	return _ADL_Overdrive5_CurrentActivity_Get(iAdapterIndex,lpActivity);
}

int ADL_Overdrive5_ODParameters_Get(int iAdapterIndex, ADLODParameters *lpOdParameters)
{
	return _ADL_Overdrive5_ODParameters_Get(iAdapterIndex,lpOdParameters);
}

int ADL_Overdrive5_FanSpeedInfo_Get(int iAdapterIndex, int iThermalControllerIndex, ADLFanSpeedInfo *lpFanSpeedInfo)
{
	return _ADL_Overdrive5_FanSpeedInfo_Get(iAdapterIndex,iThermalControllerIndex,lpFanSpeedInfo);
}

int ADL_Overdrive5_FanSpeed_Get(int iAdapterIndex, int iThermalControllerIndex, ADLFanSpeedValue *lpFanSpeedValue)
{
	return _ADL_Overdrive5_FanSpeed_Get(iAdapterIndex, iThermalControllerIndex, lpFanSpeedValue);
}

int ADL_Overdrive5_FanSpeed_Set(int iAdapterIndex, int iThermalControllerIndex, ADLFanSpeedValue *lpFanSpeedValue)
{
	return _ADL_Overdrive5_FanSpeed_Set(iAdapterIndex, iThermalControllerIndex, lpFanSpeedValue);
}

int ADL_Overdrive5_ODPerformanceLevels_Get(int iAdapterIndex, int iDefault, ADLODPerformanceLevels *lpOdPerformanceLevels)
{
	return _ADL_Overdrive5_ODPerformanceLevels_Get(iAdapterIndex, iDefault, lpOdPerformanceLevels);
}

int ADL_Overdrive5_ODPerformanceLevels_Set(int iAdapterIndex, ADLODPerformanceLevels *lpOdPerformanceLevels)
{
	return _ADL_Overdrive5_ODPerformanceLevels_Set(iAdapterIndex,lpOdPerformanceLevels);
}

int ADL_Main_Control_Refresh()
{
	return _ADL_Main_Control_Refresh();
}

int ADL_Overdrive5_PowerControl_Get(int iAdapterIndex, int* iPercentage, int* whatever)
{
	return _ADL_Overdrive5_PowerControl_Get(iAdapterIndex, iPercentage, whatever);
}

int ADL_Overdrive5_PowerControl_Set(int iAdapterIndex, int iPercentage) {
	return _ADL_Overdrive5_PowerControl_Set(iAdapterIndex, iPercentage);
}

int ADL_Overdrive5_FanSpeedToDefault_Set(int iAdapterIndex, int iThermalControllerIndex)
{
	return _ADL_Overdrive5_FanSpeedToDefault_Set(iAdapterIndex, iThermalControllerIndex);
}

int get_wchar_t_size()
{
	return sizeof(wchar_t);
}

size_t count_p_wchar_t_bytes(wchar_t *wstr)
{
	return wcslen(wstr) * sizeof(wchar_t);
}

size_t get_p_wchar_t_bytes(wchar_t *wstr, char * pchar, size_t len)
{
	size_t wlen,cpylen;
	wlen = count_p_wchar_t_bytes(wstr);
	cpylen = len > wlen ? wlen : len;
	memcpy(pchar, wstr, cpylen);
	return cpylen;
}

size_t getAdapterInfoSize() {
	return  sizeof(struct AdapterInfo);
}

int jadl_init(void)
{

	int result;
	if (_jadl_is_init) return 1;

#if defined (LINUX)
	_hDLL = dlopen( "libatiadlxx.so", RTLD_LAZY|RTLD_GLOBAL);
#else
	_hDLL = LoadLibrary("atiadlxx.dll");
	if (_hDLL == NULL)
		// A 32 bit calling application on 64 bit OS will fail to LoadLIbrary.
		// Try to load the 32 bit library (atiadlxy.dll) instead
		_hDLL = LoadLibrary("atiadlxy.dll");
#endif
	if (_hDLL == NULL) {
		return 0;
	}
	_ADL_Main_Control_Create = (ADL_MAIN_CONTROL_CREATE) GetProcAddress(_hDLL,"ADL_Main_Control_Create");
	_ADL_Main_Control_Destroy = (ADL_MAIN_CONTROL_DESTROY) GetProcAddress(_hDLL,"ADL_Main_Control_Destroy");
	_ADL_Adapter_NumberOfAdapters_Get = (ADL_ADAPTER_NUMBEROFADAPTERS_GET) GetProcAddress(_hDLL,"ADL_Adapter_NumberOfAdapters_Get");
	_ADL_Adapter_AdapterInfo_Get = (ADL_ADAPTER_ADAPTERINFO_GET) GetProcAddress(_hDLL,"ADL_Adapter_AdapterInfo_Get");
	_ADL_Adapter_ID_Get = (ADL_ADAPTER_ID_GET) GetProcAddress(_hDLL,"ADL_Adapter_ID_Get");
	_ADL_Overdrive5_Temperature_Get = (ADL_OVERDRIVE5_TEMPERATURE_GET) GetProcAddress(_hDLL,"ADL_Overdrive5_Temperature_Get");
	_ADL_Overdrive5_CurrentActivity_Get = (ADL_OVERDRIVE5_CURRENTACTIVITY_GET) GetProcAddress(_hDLL, "ADL_Overdrive5_CurrentActivity_Get");
	_ADL_Overdrive5_ODParameters_Get = (ADL_OVERDRIVE5_ODPARAMETERS_GET) GetProcAddress(_hDLL, "ADL_Overdrive5_ODParameters_Get");
	_ADL_Overdrive5_FanSpeedInfo_Get = (ADL_OVERDRIVE5_FANSPEEDINFO_GET) GetProcAddress(_hDLL, "ADL_Overdrive5_FanSpeedInfo_Get");
	_ADL_Overdrive5_FanSpeed_Get = (ADL_OVERDRIVE5_FANSPEED_GET) GetProcAddress(_hDLL, "ADL_Overdrive5_FanSpeed_Get");
	_ADL_Overdrive5_FanSpeed_Set = (ADL_OVERDRIVE5_FANSPEED_SET) GetProcAddress(_hDLL, "ADL_Overdrive5_FanSpeed_Set");
	_ADL_Overdrive5_ODPerformanceLevels_Get = (ADL_OVERDRIVE5_ODPERFORMANCELEVELS_GET) GetProcAddress(_hDLL, "ADL_Overdrive5_ODPerformanceLevels_Get");
	_ADL_Overdrive5_ODPerformanceLevels_Set = (ADL_OVERDRIVE5_ODPERFORMANCELEVELS_SET) GetProcAddress(_hDLL, "ADL_Overdrive5_ODPerformanceLevels_Set");
	_ADL_Main_Control_Refresh = (ADL_MAIN_CONTROL_REFRESH) GetProcAddress(_hDLL, "ADL_Main_Control_Refresh");
	_ADL_Overdrive5_PowerControl_Get = (ADL_OVERDRIVE5_POWERCONTROL_GET) GetProcAddress(_hDLL, "ADL_Overdrive5_PowerControl_Get");
	_ADL_Overdrive5_PowerControl_Set = (ADL_OVERDRIVE5_POWERCONTROL_SET) GetProcAddress(_hDLL, "ADL_Overdrive5_PowerControl_Set");
	_ADL_Overdrive5_FanSpeedToDefault_Set = (ADL_OVERDRIVE5_FANSPEEDTODEFAULT_SET) GetProcAddress(_hDLL, "ADL_Overdrive5_FanSpeedToDefault_Set");

	if (!_ADL_Main_Control_Create ||
		!_ADL_Main_Control_Destroy ||
		!_ADL_Adapter_NumberOfAdapters_Get ||
		!_ADL_Adapter_AdapterInfo_Get ||
		!_ADL_Adapter_ID_Get ||
		!_ADL_Overdrive5_Temperature_Get ||
		!_ADL_Overdrive5_CurrentActivity_Get ||
		!_ADL_Overdrive5_ODParameters_Get ||
		!_ADL_Overdrive5_FanSpeedInfo_Get ||
		!_ADL_Overdrive5_FanSpeed_Get ||
		!_ADL_Overdrive5_FanSpeed_Set ||
		!_ADL_Overdrive5_ODPerformanceLevels_Get ||
		!_ADL_Overdrive5_ODPerformanceLevels_Set ||
		!_ADL_Main_Control_Refresh ||
		!_ADL_Overdrive5_PowerControl_Get ||
		!_ADL_Overdrive5_PowerControl_Set ||
		!_ADL_Overdrive5_FanSpeedToDefault_Set) {
			//applog(LOG_WARNING, "ATI ADL's API is missing");
		return 0;
	}

	_jadl_is_init = 1;
	return 1;
}

